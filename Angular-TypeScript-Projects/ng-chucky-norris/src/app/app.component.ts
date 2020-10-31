import { Component } from '@angular/core';
import { JokeService } from './services/joke.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-chucky-norris';

  chuckyJoke = "";

  constructor(private jokeService:JokeService) {

  }

  async getJokes() {
    try {
      const joke:any = await this.jokeService.getJokes();
      const jokeValue = joke.value;
      this.chuckyJoke = jokeValue;

      console.log(joke);
    } catch (error) {
      console.log(`[ERROR] ==> AppComponent ==> getJokes ==>`, error)
      alert("Failed to get jokes")
    }
  }
}
