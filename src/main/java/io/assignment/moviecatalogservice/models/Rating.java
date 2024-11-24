package io.assignment.moviecatalogservice.models;

public class Rating {
        private Long id;

        private int movieId;

        private int userId;
        private int rating;

        private String description;

        public Rating(){}
        public Rating(int movieId, int userId, int rating) {
            this.movieId = movieId;
            this.userId= userId;
            this.rating = rating;
        }

        public Rating(Long id, int movieId, int userId, int rating, String description) {
            this.id = id;
            this.movieId = movieId;
            this.userId = userId;
            this.rating = rating;
            this.description = description;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
