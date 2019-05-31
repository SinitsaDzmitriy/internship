package edu.sam.aveng.DAO;

import java.util.List;

import edu.sam.aveng.entities.UserDictionaryCard;

public interface UserDictionaryCardDao {

    UserDictionaryCard findById(int id);

    void saveUserDictionaryCard(UserDictionaryCard card);

    void deleteUserDictionaryCardByPhraseInEnglish(String phrase);

    List<UserDictionaryCard> findAllUserDictionaryCards();

    UserDictionaryCard findUserDictionaryCardByPhraseInEnglish(String phrase);

}
