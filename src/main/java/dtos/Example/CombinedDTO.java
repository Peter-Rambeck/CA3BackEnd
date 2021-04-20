/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos.Example;

/**
 *
 * @author peter
 */
public class CombinedDTO {
    
    private AnimeDTO anime;
    private WeatherDTO weather;
    private  ChuckDTO chuck;
    private CatDTO cat;
    private JokeDTO joke;

    public CombinedDTO(AnimeDTO anime, WeatherDTO weather, ChuckDTO chuck, CatDTO cat, JokeDTO joke) {
        this.anime = anime;
        this.weather = weather;
        this.chuck = chuck;
        this.cat = cat;
        this.joke = joke;
    }

    public AnimeDTO getAnime() {
        return anime;
    }

    public void setAnime(AnimeDTO anime) {
        this.anime = anime;
    }

    public WeatherDTO getWeather() {
        return weather;
    }

    public void setWeather(WeatherDTO weather) {
        this.weather = weather;
    }


    public ChuckDTO getChuck() {
        return chuck;
    }

    public void setChuck(ChuckDTO chuck) {
        this.chuck = chuck;
    }

    public CatDTO getCat() {
        return cat;
    }

    public void setCat(CatDTO cat) {
        this.cat = cat;
    }

    public JokeDTO getJoke() {
        return joke;
    }

    public void setJoke(JokeDTO joke) {
        this.joke = joke;
    }
    
    
    
}
