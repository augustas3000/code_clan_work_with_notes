use hotel;

db.dropDatabase();

db.bookings.insertMany([
  {
   name: "Jan Jindra",
   height: 200,
   email: "Jan.Jindra@codeclan.co.uk",
   isCheckedIn: true
  },
  {
   name: "Augustas Juskevicius",
   height: 180,
   email: "Augustas.J@codeclan.co.uk",
   isCheckedIn: false
  },
  {
   name: "Alan Bond",
   height: 175,
   email: "AlanB@hotmail.com",
   isCheckedIn: true
  }
]);
