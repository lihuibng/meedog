package com.macro.meedog.common.tair;

/**
 * @author "xxxxxx"
 * @modified 2021/1/3 2:44 下午
 */

import com.taobao.tair.DataEntry;
import com.taobao.tair.Result;
import com.taobao.tair.ResultCode;
import com.taobao.tair.impl.DefaultTairManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author "xxxxxx"
 * @modified 2021/1/3 4:01 下午
 */

public class TairClientUtil {

    private static final Logger LOG = LoggerFactory.getLogger(TairClientUtil.class);

    private DefaultTairManager tairManager = new DefaultTairManager();

    public TairClientUtil(List<String> confServers, String group) {
        this.init(confServers, group);
    }

    public void init(List<String> confServers, String group) {

        // 创建config server列表
        //List<String> confServers = new ArrayList<String>();
        // confServers.add("39.105.65.101:5198");
        //confServers.add(endpoints);

        // 创建客户端实例
        tairManager.setConfigServerList(confServers);

        // 设置组名
        // tairManager.setGroupName("group_1");
        tairManager.setGroupName(group);
        // 初始化客户端
        tairManager.init();
    }

    /**
     * 获取数据
     *
     * @param namespace 数据所在的namespace
     * @param key       要获取的数据的key
     * @return
     */
    public DataEntry get(int namespace, Serializable key) {
        Result<DataEntry> result = tairManager.get(namespace, key);
        if (result.isSuccess()) {
            DataEntry entry = result.getValue();
            LOG.info("get key: " + key);
            return entry;
        } else {
            LOG.info("get key: " + key);
            return null;
        }
    }

    /**
     * 批量获取数据
     *
     * @param namespace 数据所在的namespace
     * @param keys      要获取的数据的key列表
     * @return 如果成功，返回的数据对象为一个Map<Key, Value>
     */
    public List<DataEntry> mget(int namespace, List<? extends Object> keys) {
        Result<List<DataEntry>> result = tairManager.mget(namespace, keys);
        if (result.isSuccess()) {
            List<DataEntry> entries = result.getValue();
            LOG.info("get key: value: ");
            return entries;
        } else {
            LOG.info("mget value: ");
            return null;
        }
    }

    /**
     * 设置数据，如果数据已经存在，则覆盖，如果不存在，则新增 如果是新增，则有效时间为0，即不失效 如果是更新，则不检查版本，强制更新
     *
     * @param namespace 数据所在的namespace
     * @param key
     * @param value
     * @return
     */
    public ResultCode put(int namespace, Serializable key, Serializable value) {
        ResultCode result = tairManager.put(namespace, key, value);
        return result;
    }

    /**
     * 设置数据，如果数据已经存在，则覆盖，如果不存在，则新增
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @param value     数据的value
     * @param version   数据的版本，如果和系统中数据的版本不一致，则更新失败
     * @return
     */
    public ResultCode put(int namespace, Serializable key, Serializable value,
                   int version) {
        ResultCode result = tairManager.put(namespace, key, value, version);
        return result;
    }

    /**
     * 设置数据，如果数据已经存在，则覆盖，如果不存在，则新增
     *
     * @param namespace  数据所在的namespace
     * @param key        数据的key
     * @param value      数据的value
     * @param version    数据的版本，如果和系统中数据的版本不一致，则更新失败
     * @param expireTime 数据的有效时间，单位为秒
     * @return
     */
    public ResultCode put(int namespace, Serializable key, Serializable value,
                   int version, int expireTime) {
        ResultCode result = tairManager.put(namespace, key, value, version, expireTime);
        return result;
    }

    /**
     * 删除key对应的数据
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @return
     */
    public ResultCode delete(int namespace, Serializable key) {
        ResultCode result = tairManager.delete(namespace, key);
        return result;
    }

    /**
     * 失效数据，该方法将失效由失效服务器配置的多个实例中当前group下的数据
     *
     * @param namespace 数据所在的namespace
     * @param key       要失效的key
     * @return
     * @deprecated 请直接使用delete接口
     */
    public ResultCode invalid(int namespace, Serializable key) {
        ResultCode result = tairManager.invalid(namespace, key);
        return result;
    }

    /**
     * 批量失效数据，该方法将失效由失效服务器配置的多个实例中当前group下的数据
     *
     * @param namespace 数据所在的namespace
     * @param keys      要失效的key列表
     * @return
     * @deprecated 请使用mdelete接口
     */
    public ResultCode minvalid(int namespace, List<? extends Object> keys) {
        ResultCode result = tairManager.minvalid(namespace, keys);
        return result;
    }

    /**
     * 批量删除，如果全部删除成功，返回成功，否则返回失败
     *
     * @param namespace 数据所在的namespace
     * @param keys      要删除数据的key列表
     * @return
     */
    public ResultCode mdelete(int namespace, List<? extends Object> keys) {
        ResultCode result = tairManager.mdelete(namespace, keys);
        return result;
    }

    /**
     * 将key对应的数据加上value，如果key对应的数据不存在，则新增，并将值设置为defaultValue
     * 如果key对应的数据不是int型，则返回失败
     *
     * @param namespace    数据所在的namspace
     * @param key          数据的key
     * @param value        要加的值
     * @param defaultValue 不存在时的默认值
     * @return 更新后的值
     */
    public Integer incr(int namespace, Serializable key, int value,
                         int defaultValue, int expireTime) {
        Result<Integer> result = tairManager.incr(namespace, key, value, defaultValue, expireTime);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 将key对应的数据减去value，如果key对应的数据不存在，则新增，并将值设置为defaultValue
     * 如果key对应的数据不是int型，则返回失败
     *
     * @param namespace    数据所在的namspace
     * @param key          数据的key
     * @param value        要减去的值
     * @param defaultValue 不存在时的默认值
     * @return 更新后的值
     */
    public Integer decr(int namespace, Serializable key, int value,
                         int defaultValue, int expireTime) {
        Result<Integer> result = tairManager.decr(namespace, key, value, defaultValue, expireTime);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 将key对应的计数设置成count，忽略key原来是否存在以及是否是计数类型。
     * 因为Tair中计数的数据有特别标志，所以不能直接使用put设置计数值。
     *
     * @param namespace 数据所在的namspace
     * @param key       数据的key
     * @param count     要设置的值
     */
    public ResultCode setCount(int namespace, Serializable key, int count) {
        ResultCode result = tairManager.setCount(namespace, key, count);
        return result;
    }

    /**
     * 将key对应的计数设置成count，忽略key原来是否存在以及是否是计数类型。
     * 因为Tair中计数的数据有特别标志，所以不能直接使用put设置计数值。
     *
     * @param namespace  数据所在的namspace
     * @param key        数据的key
     * @param count      要设置的值
     * @param version    版本，不关心并发，传入0
     * @param expireTime 过期时间，不使用传入0
     */
    public ResultCode setCount(int namespace, Serializable key, int count, int version, int expireTime) {
        ResultCode result = tairManager.setCount(namespace, key, count, version, expireTime);
        return result;
    }

    /**
     * 增加集合数据类型，如果原集合数据不存在，则执行insert操作
     *
     * @param namespace  数据所在的namespace
     * @param key        数据的key
     * @param items      要增加的value，当前值接受基本类型，详情参见Json.checkType
     * @param maxCount   集合允许的最大条目数量，超过这个数量，系统将直接删除相应数量的最早放入的条目
     * @param version    版本号，如果非0，当传入的版本号和系统中的版本号不同时，返回版本错误
     * @param expireTime 超时时间
     * @return 返回代码
     */
    public ResultCode addItems(int namespace, Serializable key,
                        List<? extends Object> items, int maxCount, int version,
                        int expireTime) {
        ResultCode result = tairManager.addItems(namespace, key, items, maxCount, version, expireTime);
        return result;
    }

    /**
     * 获取集合数据
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @param offset    要获取的数据的偏移量
     * @param count     要获取的数据的条数
     * @return 如果数据不存在，返回DATANOTEXIST，否则成功返回相应的条数，失败返回相应的错误代码
     */
    public DataEntry getItems(int namespace, Serializable key,
                               int offset, int count) {
        Result<DataEntry> result = tairManager.getItems(namespace, key, offset, count);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 删除集合中的数据
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @param offset    要删除的数据的偏移量
     * @param count     要删除的数据的条数
     * @return 删除是否成功
     */
    public ResultCode removeItems(int namespace, Serializable key, int offset,
                           int count) {
        ResultCode result = tairManager.removeItems(namespace, key, offset, count);
        if (result.isSuccess()) {
            return result;
        }
        return result;
    }

    /**
     * 删除并返回集合中的数据
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @param offset    要删除的数据的偏移量
     * @param count     要删除的数据的条数
     * @return 如果删除成功，返回本次删除成功删除的数据
     */
    public DataEntry getAndRemove(int namespace,
                                   Serializable key, int offset, int count) {
        Result<DataEntry> result = tairManager.getAndRemove(namespace, key, offset, count);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 获取key对应的集合中的条目数量
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @return 如果数据不存在，返回不存在；否则成功返回集合的条目数量，失败返回相应的错误代码
     */
    public Integer getItemCount(int namespace, Serializable key) {
        Result<Integer> result = tairManager.getItemCount(namespace, key);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }


    /**
     * 锁住一个key，不再允许更新, 允许读和删除。
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @return 如果数据不存在，返回不存在；如果数据存在但已经被lock，返回lock已经存在的错误码；
     * 否则成功。
     */
    public ResultCode lock(int namespace, Serializable key) {
        ResultCode result = tairManager.lock(namespace, key);
        return result;
    }


    /**
     * 解锁一个key。
     *
     * @param namespace 数据所在的namespace
     * @param key       数据的key
     * @return 如果数据不存在，返回不存在；如果数据存在但未被lock，返回lock不存在的错误码；
     * 否则成功。
     */
    public ResultCode unlock(int namespace, Serializable key) {
        ResultCode result = tairManager.unlock(namespace, key);
        return result;
    }

    /**
     * 批量锁key。
     *
     * @param namespace 数据所在的namespace
     * @param keys      数据的key
     * @return Result.getRc()是返回的ResultCode, 如果都成功, 返回成功；
     * 如果返回PARTSUCC, 则Result.getValue()为成功的key.
     */
    public List<Object> mlock(int namespace, List<? extends Object> keys) {
        Result<List<Object>> result = tairManager.mlock(namespace, keys);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 批量锁key。
     *
     * @param namespace   数据所在的namespace
     * @param keys        数据的key
     * @param failKeysMap 传入保存失败的key
     * @return Result.getRc()是返回的ResultCode, 如果都成功, 返回成功；
     * 如果返回PARTSUCC, 则Result.getValue()为成功的key,并且如果传入failKeysMap不为null，
     * failKeysMap为失败的key以及对应的错误码。
     */
    public List<Object> mlock(int namespace, List<? extends Object> keys, Map<Object, ResultCode> failKeysMap) {
        Result<List<Object>> result = tairManager.mlock(namespace, keys, failKeysMap);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 批量解锁key。
     *
     * @param namespace 数据所在的namespace
     * @param keys      数据的key
     * @return Result.getRc()是返回的ResultCode, 如果都成功, 返回成功；
     * 如果返回PARTSUCC, 则Result.getValue()为成功的key.
     */
    public List<Object> munlock(int namespace, List<? extends Object> keys) {
        Result<List<Object>> result = tairManager.munlock(namespace, keys);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 批量解锁key。
     *
     * @param namespace   数据所在的namespace
     * @param keys        数据的key
     * @param failKeysMap 传入保存失败的key
     * @return Result.getRc()是返回的ResultCode, 如果都成功, 返回成功；
     * 如果返回PARTSUCC, 则Result.getValue()为成功的key,并且如果传入failKeysMap不为null，
     * failKeysMap为失败的key以及对应的错误码。
     */
    public List<Object> munlock(int namespace, List<? extends Object> keys, Map<Object, ResultCode> failKeysMap) {
        Result<List<Object>> result = tairManager.munlock(namespace, keys, failKeysMap);
        if (result.isSuccess()) {
            return result.getValue();
        }
        return null;
    }

    /**
     * 得到统计信息
     *
     * @param qtype     统计类型
     * @param groupName 统计的group name
     * @param serverId  统计的服务器
     * @return 统计的 结果:统计项和统计值对
     */
    public Map<String, String> getStat(int qtype, String groupName, long serverId) {
        Map<String, String> result = tairManager.getStat(qtype, groupName, serverId);
        return result;
    }


    /**
     * 获取客户端的版本
     */
    public String getVersion() {
        return String.valueOf(tairManager.getVersion());
    }
}
