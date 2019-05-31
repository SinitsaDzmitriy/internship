package edu.sam.aveng.service;

import edu.sam.aveng.DAO.UserDictionaryCardDao;
import edu.sam.aveng.entities.UserDictionaryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;


@Service("userDictionaryCardService")
@Transactional
public class UserDictionaryCardServiceImpl implements UserDictionaryCardService {

    @Autowired
    private UserDictionaryCardDao dao;

    public void saveUserDictionaryCard(UserDictionaryCard card){
        dao.saveUserDictionaryCard(card);
    }

    public UserDictionaryCard findById(int id){
        return dao.findById(id);
    }

    public List<UserDictionaryCard> findAllUserDictionaryCards(){
        return dao.findAllUserDictionaryCards();
    }

    public UserDictionaryCard findUserDictionaryCardByPhraseInEnglish(String phrase){
        return dao.findUserDictionaryCardByPhraseInEnglish(phrase);
    }

    public void updateUserDictionaryCard(UserDictionaryCard card){
        UserDictionaryCard entry = dao.findById(card.getId());
        if(entry != null){
            entry.setPhraseInEnglish(card.getPhraseInEnglish());
            entry.setTranslation(card.getTranslation());
            entry.setDefaultUsageExample(card.getDefaultUsageExample());
            entry.setUserUsageExample(card.getUserUsageExample());
            entry.setNumberOfTrainings(card.getNumberOfTrainings());
            entry.setLastTrainingDate(card.getLastTrainingDate());
        }
    }

    public void deleteUserDictionaryCardByPhraseInEnglish(String phrase){
        dao.deleteUserDictionaryCardByPhraseInEnglish(phrase);
    }
}
