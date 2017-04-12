package cn.ueedit.app.repository.pojo;

import cn.ueedit.app.commons.BasePojo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Frank on 2017/4/12.
 */
@Entity
@Table(name = "`user`")
public class User extends BasePojo {

    @Getter
    @Setter
    @Column(name="`name`", length = 50)
    private String name;

    @Getter
    @Setter
    @Column(name="`age`")
    private Integer age;
}
