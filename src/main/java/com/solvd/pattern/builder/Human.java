package com.solvd.pattern.builder;

import java.time.LocalDate;

public class Human {

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private double weight;
    private double growth;
    private String skinColor;
    private String eyeColor;

    public static Builder builder() {
        return new Builder(new Human());
    }

    public static class Builder {
        private final Human human;

        public Builder(Human human) {
            this.human = human;
        }

        public Human build() {
            return this.human;
        }

        public Builder firstName(String firstName) {
            this.human.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.human.lastName = lastName;
            return this;
        }

        public Builder patronymic(String patronymic) {
            this.human.patronymic = patronymic;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.human.birthday = birthday;
            return this;
        }

        public Builder weight(double weight) {
            this.human.weight = weight;
            return this;
        }

        public Builder growth(double growth) {
            this.human.growth = growth;
            return this;
        }

        public Builder skinColor(String skinColor) {
            this.human.skinColor = skinColor;
            return this;
        }

        public Builder eyeColor(String eyeColor) {
            this.human.eyeColor = eyeColor;
            return this;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public double getWeight() {
        return weight;
    }

    public double getGrowth() {
        return growth;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

}
