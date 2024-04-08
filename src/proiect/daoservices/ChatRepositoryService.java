package proiect.daoservices;

import proiect.model.Chat;
import proiect.dao.ChatDao;

import java.util.List;

public class ChatRepositoryService {
    private final ChatDao chatDao = new ChatDao();

    public void addChat(Chat chat) {
        chatDao.createChat(chat);
    }

    public Chat getChatById(int id) {
        return chatDao.readChat(id);
    }

    public void updateChat(int id, Chat updatedChat) {
        chatDao.updateChat(id, updatedChat);
    }

    public void removeChat(Chat chat) {
        chatDao.deleteChat(chat);
    }

    public List<Chat> getAllChats() {
        return chatDao.findAllChats();
    }
}
