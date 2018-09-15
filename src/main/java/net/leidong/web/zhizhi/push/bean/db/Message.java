package net.leidong.web.zhizhi.push.bean.db;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @program: ZhiZhiServer
 * @description: 消息的Model，对应数据库
 * @author: Lei Dong
 * @create: 2018-08-25 22:06
 **/
@Entity
@Table(name = "TB_MESSAGE")
public class Message {
    // 发送给人的
    public static final int RECEIVER_TYPE_NONE = 1;
    // 发送给群的
    public static final int RECEIVER_TYPE_GROUP = 2;

    // 字符串类型
    public static final int TYPE_STR = 1;
    // 图片类型
    public static final int TYPE_PIC = 2;
    // 文件类型
    public static final int TYPE_FILE = 3;
    // 音频类型
    public static final int TYPE_AUDIO = 4;

    @Id
    @PrimaryKeyJoinColumn
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(updatable = false, nullable = false)
    private String id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column
    private String attach;

    @Column(nullable = false)
    private int type;

    @JoinColumn(name = "senderId")
    @ManyToOne(optional = false)
    private User sender;

    @Column(nullable = false, updatable = false, insertable = false)
    private String senderId;

    @ManyToOne
    @JoinColumn(name = "receiverId")
    private User receiver;

    @Column(nullable = false, insertable = false)
    private String receiverId;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;

    @Column(nullable = false, insertable = false)
    private String groupId;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime createAt = LocalDateTime.now();

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updateAt = LocalDateTime.now();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
