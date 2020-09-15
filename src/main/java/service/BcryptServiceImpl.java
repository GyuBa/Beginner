package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BcryptServiceImpl implements BcryptService {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public String hashing(String pwd) {
        return bCryptPasswordEncoder.encode(pwd);
    }

    @Override
    public boolean decode(String pwd, String dbPwd) {
        return bCryptPasswordEncoder.matches(pwd, dbPwd);
    }
}
