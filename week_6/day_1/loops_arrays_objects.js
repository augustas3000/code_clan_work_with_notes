

var sports = ['football', 'tennis', 'rugby'];

// console.log('number of elements: ', sports.length);
//
// console.log('first sport:', sports[0]);

sports.push('curling');
sports.push('snooker');
sports.push('darts');

// console.log(sports);

// sports.pop();

// console.log(sports);

// console.log(sports[sports.length-1]);
// sports[sports.length] = 'tennis';
// console.log(sports);
// sports.unshift('basketball');
// console.log(sports);
//
//
// var removeSport = sports.splice(4);
// console.log(removeSport);
// console.log(sports);

// splice syntax:
// let arrDeletedItems = array.splice(start[, deleteCount[, item1[, item2[, ...]]]])


//
// for (var currentSport of sports) {
//   var upperCasedSport =
//   currentSport.toUpperCase();
//   console.log(upperCasedSport);
// }
//
//
// for (var i = 0; i < sports.length; i+=2) {
//   var currentSport = sports[i];
//   var upperCasedSport = currentSport.toUpperCase();
//   console.log(upperCasedSport);
// }


// for (initializeCounter; condition; mutateCounter)

// objects
var movie = {
  title: 'Parasite',
  year: 2019,
  language: 'Korean'
};

// console.log('movie object: ', movie);
// console.log(movie['title']);
// console.log(movie.title);

movie.cast = ['Song Kang-ho', 'Lee Sun-kyun'];

movie.language = 'English';

movie['language'] = 'French';

movie['subtitle-language'] = 'English';

// console.log('movie: ', movie);
// console.log(movie['subtitle-language']);



var propertyToAccess = 'subtitle-language';

movie[propertyToAccess] = 'German';
// console.log('subtit lang: ', movie[propertyToAccess]);
// console.log('lang: ', movie.propertyToAccess);

// delete:
delete movie.year;

// console.log('movie without year: ', movie);


// nested objects, hierarchy of data.

movie.ratings = {
  critic: 94,
  audience: 95
}

// console.log(movie.ratings.audience);
// iterate over objects:

// for (var key in movie) {
//   console.log(`The ${key} is ${movie[key]}`);
// }

// var keys = Object.keys(movie);
// console.log('keys:', keys);

// ------------------------------------------------------------
// task

var movies = [
  {
    title: 'It\'s a Wonderful Life',
    year: 1946,
    director: 'Frank Capra',
    cast: [
      'James Stewart',
      'Donna Reed'
    ],
    ratings: {
      critic: 94,
      audience: 95
    }
  },
  {
    title: 'Black Panther',
    year: 2018,
    director: 'Ryan Coogler',
    cast: [
      'Chadwick Boseman',
      'Michael B. Jordan'
    ],
    ratings: {
      critic: 97,
      audience: 77
    }
  },
  {
    title: 'Star Wars: The Last Jedi',
    year: 2017,
    director: 'Rian Johnson',
    cast: [
      'Mark Hamill',
      'Carrie Fisher'
    ],
    ratings: {
      critic: 91,
      audience: 48
    }
  },
  {
    title: 'Citizen Kane',
    year: 1941,
    director: 'Orson Welles',
    cast: [
      'Joseph Cotten',
      'Dorothy Comingore'
    ],
    ratings: {
      critic: 100,
      audience: 90
    }
  },
];
// 1. Loop through the array of movies and make each movie's title all capital letters.

for (var i = 0; i < movies.length; i++) {
  movies[i].title = movies[i].title.toUpperCase();
}

console.log(movies);



// 2. Loop through the array and find the movie with the title Citizen Kane. log its year of release.

for (var i = 0; i < movies.length; i++) {
  var release_yr;
  if (movies[i].title === 'CITIZEN KANE') {
    release_yr = movies[i].year
  }
}
console.log(release_yr);


// 3. Using a different kind of loop, iterate through the movies and log each movie's title and audience rating.

for (var i = 0; i < movies.length; i++) {
  console.log(movies[i].title);
  console.log(movies[i].ratings.audience);
}
