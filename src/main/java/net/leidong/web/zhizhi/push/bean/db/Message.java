package net.leidong.web.zhizhi.push.bean.db;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JoinColumnOrFormula;
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
    private String type;

    @Column(nullable = false)
    private String sebder;

    @Column
    private String receiver;

    @Column
    private Group group;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSebder() {
        return sebder;
    }

    public void setSebder(String sebder) {
        this.sebder = sebder;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
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
}
