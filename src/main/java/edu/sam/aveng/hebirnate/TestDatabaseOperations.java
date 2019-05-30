package edu.sam.aveng.hebirnate;

import edu.sam.aveng.entities.UserDictionaryCard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;
import java.util.List;

public class TestDatabaseOperations {
    public static void main(String[] args){

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        // TODO Ask Dima if it's OK :)
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }

        if(sessionFactory != null) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.save(new UserDictionaryCard("hello", "привет", "Hello world!",
                    "Hello Java!", new Date(), 0));
            session.save(new UserDictionaryCard("sorry", "извини", "Sorry, dude.",
                    "sorry to keep you", new Date(), 2));
            session.save(new UserDictionaryCard("rubbish", "хлам", "It's only rubbish",
                    "Example with rubbish", new Date(),1));

            session.getTransaction().commit();
            session.close();

            // ===============================

            displayAllEntries(sessionFactory);

            // ===============================

            session = sessionFactory.openSession();
            session.beginTransaction();

            UserDictionaryCard ObtainedByQueryCard = (UserDictionaryCard) session.createQuery("select card" +
                    " from UserDictionaryCard card where card.phraseInEnglish like :phraseInEnglish")
                    .setParameter( "phraseInEnglish", "hello" )
                    .uniqueResult();

            ObtainedByQueryCard.display();

            ObtainedByQueryCard.setTranslation("здравствуй");
            session.flush();

            ObtainedByQueryCard.display();

            session.delete(ObtainedByQueryCard);

            session.getTransaction().commit();
            session.close();

            // ===============================

            displayAllEntries(sessionFactory);
        }
    }

    public static void displayAllEntries(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<UserDictionaryCard> result = session.createQuery("from UserDictionaryCard").list();
        for (UserDictionaryCard card : result) {
            card.display();
        }
        session.getTransaction().commit();
        session.close();
    }
}
