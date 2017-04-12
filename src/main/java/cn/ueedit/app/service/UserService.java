package cn.ueedit.app.service;

import cn.ueedit.app.commons.CommonService;
import cn.ueedit.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Frank on 2017/4/12.
 */
@Service
public class UserService extends CommonService {

    @Autowired
    private UserRepository userRepository;



}
