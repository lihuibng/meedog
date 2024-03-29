package com.macro.meedog.server.service;

/**
 * @author "xxxxxx"
 * @modified 2020/11/14 3:17 下午
 */

import javax.mail.MessagingException;

/**
 * <p>
 * 邮件接口
 * </p>
 *
 * @package: com.xkcoding.email.service
 * @description: 邮件接口
 * @author:
 * @date: Created in 2018/11/21 11:16
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified:
 */
public interface MailService {
    /**
     * 发送文本邮件
     *
     * @param to      收件人地址
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param cc      抄送地址
     */
    void sendSimpleMail(String to, String subject, String content, String... cc);

    /**
     * 发送HTML邮件
     *
     * @param to      收件人地址
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param cc      抄送地址
     * @throws MessagingException 邮件发送异常
     */
    void sendHtmlMail(String to, String subject, String content, String... cc) throws MessagingException;

    /**
     * 发送带附件的邮件
     *
     * @param to       收件人地址
     * @param subject  邮件主题
     * @param content  邮件内容
     * @param filePath 附件地址
     * @param cc       抄送地址
     * @throws MessagingException 邮件发送异常
     */
    void sendAttachmentsMail(String to, String subject, String content, String filePath, String... cc) throws MessagingException;

    /**
     * 发送正文中有静态资源的邮件
     *
     * @param to      收件人地址
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param rscPath 静态资源地址
     * @param rscId   静态资源id
     * @param cc      抄送地址
     * @throws MessagingException 邮件发送异常
     */
    void sendResourceMail(String to, String subject, String content, String rscPath, String rscId, String... cc) throws MessagingException;

    /**
     * 发送邮件的方法
     *
     * @param to   邮件的接收方
     * @param code 邮件的激活码
     */
    boolean sendMail(String to, String code);

    /**
     * 发送找回密码邮件的方法
     *
     * @param to   邮件的接收方
     * @param code 邮件的验证码
     */
    boolean findPasswordMail(String to, String code);
}