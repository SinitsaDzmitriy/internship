package edu.sam.aveng.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sam.aveng.entities.UserDictionaryCard;

@Repository("userDictionaryCardDao")
public class UserDictionaryCardDaoImpl extends AbstractDao<Integer, UserDictionaryCard>
        implements UserDictionaryCardDao {

    @SuppressWarnings("unchecked")
    public List<UserDictionaryCard> findAllUserDictionaryCards(){
        return getSession().createQuery("from UserDictionaryCard").list();
    }

    public UserDictionaryCard findById(int id) {
        return getByKey(id);
    }

    public UserDictionaryCard findUserDictionaryCardByPhraseInEnglish(String phrase){
        return (UserDictionaryCard) getSession()
                .createQuery("select card from UserDictionaryCard card where card.phraseInEnglish like :phraseInEnglish")
                .setParameter( "phraseInEnglish", phrase ).uniqueResult();
    }

    public void saveUserDictionaryCard(UserDictionaryCard card){
        persist(card);
    }

   public void deleteUserDictionaryCardByPhraseInEnglish(String phrase){
       getSession().createQuery("delete from UserDictionaryCard card where card.phraseInEnglish like :phraseInEnglish")
               .setParameter( "phraseInEnglish", phrase );
   }

}