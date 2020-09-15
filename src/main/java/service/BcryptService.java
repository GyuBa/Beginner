package service;

public interface BcryptService {
    public String hashing(String pwd);
    public boolean decode(String pwd, String dbPwd);
}
