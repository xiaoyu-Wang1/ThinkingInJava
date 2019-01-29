//: polymorphism/music/Music.java
// Inheritance & upcasting.
package polymorphism.music;

public class Music {
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute); // Upcasting
    Instrument instrument = new Wind();
//    instrument.giveToSomeOne(); 方法丢失
  }
} /* Output:
Wind.play() MIDDLE_C
*///:~
