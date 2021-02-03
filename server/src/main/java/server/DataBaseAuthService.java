package server;

public class DataBaseAuthService implements AuthService {

    @Override
    public String getNicknameByLoginAndPassword(String login, String password) {
        return Database.getUserNickname(login, password);
    }

    @Override
    public boolean registration(String login, String password, String nickname) {
        return Database.createUser(login, password, nickname);
    }

    @Override
    public boolean changeNickname(String currentNickname, String newNickname) {
        return Database.changeUserNickname(currentNickname, newNickname);
    }
}
