//package edu.sam.aveng.entities;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//public class UserDictionaryCard {
//
//    @Id
//    @GeneratedValue(generator="increment")
//    @GenericGenerator(name="increment", strategy = "increment")
//    private int id;
//
////    @Column(name = "PHRASE_IN_ENGLISH")
//    private String phraseInEnglish;
//
////    @Column(name = "TRANSLATION")
//    private String translation;
//
////    @Column(name = "DEFAULT_USAGE_EXAMPLE")
//    private String defaultUsageExample;
//
////    @Column(name = "USER_USAGE_EXAMPLE")
//    private String userUsageExample;
//
//    @Temporal(TemporalType.TIMESTAMP)
////    @Column(name = "LAST_TRAINING_DATE")
//    private Date lastTrainingDate;
//
////    @Column(name = "NUMBER_OF_TRAININGS")
//    private int numberOfTrainings;
//
//    // TODO add fields mentioned below
//    // image
//    // audio
//    // enum: part of speech or phrase
//    // enum: state
//
//    public UserDictionaryCard(String phraseInEnglish, String translation, String defaultUsageExample,
//                              String userUsageExample, Date lastTrainingDate, int numberOfTrainings) {
//        this.phraseInEnglish = phraseInEnglish;
//        this.translation = translation;
//        this.defaultUsageExample = defaultUsageExample;
//        this.userUsageExample = userUsageExample;
//        this.lastTrainingDate = lastTrainingDate;
//        this.numberOfTrainings = numberOfTrainings;
//    }
//
//    public UserDictionaryCard() {}
//
//    public void display() {
//        System.out.println(phraseInEnglish + " - " + translation);
//        System.out.println("Usage example: " + defaultUsageExample);
//        System.out.println("User note:" + userUsageExample);
//        System.out.println("Last training date: " + lastTrainingDate);
//        System.out.println("Number of trainings: " + numberOfTrainings);
//    }
//
//    public void setTranslation(String translation) {
//        this.translation = translation;
//    }
//}
