package site.bigbear.classmate.party.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.bigbear.classmate.party.mapper.UserInfoMapper;
import site.bigbear.classmate.party.pojo.UserInfo;

/**
 * @author cheyantao
 */
@Service
public class UserInfoServiceImpl extends BaseServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper mapper;
    @Override
    public UserInfo findByUserId(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean save(UserInfo info) {
        if (info.getId()==null){
            return this.mapper.insert(info)>0;
        }else {
            return this.mapper.updateByPrimaryKey(info)>0;
        }
    }

    @Override
    public boolean delete(Long id) {
        return this.mapper.deleteByPrimaryKey(id)>0;
    }
}
