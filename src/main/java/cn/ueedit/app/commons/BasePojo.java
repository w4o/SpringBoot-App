package cn.ueedit.app.commons;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Frank on 2017/4/12.
 */
@MappedSuperclass
public abstract class BasePojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
