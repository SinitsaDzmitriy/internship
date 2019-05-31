package edu.sam.aveng.service;

import edu.sam.aveng.entities.UserDictionaryCard;

import java.util.List;

public interface UserDictionaryCardService {

    UserDictionaryCard findById(int id);

    void saveUserDictionaryCard(UserDictionaryCard card);

    void updateUserDictionaryCard(UserDictionaryCard card);

    void deleteUserDictionaryCardByPhraseInEnglish(String phrase);

    List<UserDictionaryCard> findAllUserDictionaryCards();

    UserDictionaryCard findUserDictionaryCardByPhraseInEnglish(String phrase);

}
