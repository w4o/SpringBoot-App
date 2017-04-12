package cn.ueedit.app.commons;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Frank on 2017/4/12.
 */
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CommonService {
}
