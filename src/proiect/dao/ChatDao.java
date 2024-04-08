package proiect.dao;

import proiect.model.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatDao {
    private static int nextId = 1;
    private static List<Chat> chats = new ArrayList<>();

    public void createChat(Chat chat) {
        chat.setId(nextId++);
        chats.add(chat);
    }

    public Chat readChat(int id) {
        for (Chat chat : chats) {
            if (chat.getId() == id) {
                return chat;
            }
        }
        return null;
    }

    public void updateChat(int id, Chat chatUpdated) {
        for (int i = 0; i < chats.size(); i++) {
            Chat chat = chats.get(i);
            if (chat.getId() == id) {
                chatUpdated.setId(id);
                chats.set(i, chatUpdated);
                return;
            }
        }
    }

    public void deleteChat(Chat chat) {
        chats.remove(chat);
    }

    public List<Chat> findAllChats() {
        return new ArrayList<>(chats);
    }
}

