package service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import mapper.system.UserMapper;
import model.system.User;
import org.springframework.stereotype.Service;
import service.system.IUserService;


/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}