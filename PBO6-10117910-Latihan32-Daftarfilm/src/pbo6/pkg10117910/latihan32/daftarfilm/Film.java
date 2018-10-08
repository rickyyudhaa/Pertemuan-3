/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan32.daftarfilm;

/**
 *
 * @author rickyyudhaa
 */
public class Film {
    String filmName,filmGenre;
    double filmRating;
    int filmDuration;
    
    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration){
        System.out.println("Judul Film      : "+filmName);
        System.out.println("Genre Film      : "+this.filmGenre);
        System.out.println("Rating Film     : "+filmRating+" (imdb)");
        System.out.println("Durasi Film     : "+filmDuration+" Menit");
    }
}
