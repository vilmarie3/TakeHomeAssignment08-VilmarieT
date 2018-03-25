package com.example.android.takehomeassignment08_vilmariet;

/**
 * Created by vilmarietaraza on 3/25/18.
 */

class Royals {
    public int name;
    public int professionalBlurb;
    public int pictureId;
    public boolean isAcceptedByPeople;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getProfessionalBlurb() {
        return professionalBlurb;
    }

    public void setProfessionalBlurb(int professionalBlurb) {
        this.professionalBlurb = professionalBlurb;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public boolean isAcceptedByPeople() {
        return isAcceptedByPeople;
    }

    public void setAcceptedByPeople(boolean acceptedByPeople) {
        isAcceptedByPeople = acceptedByPeople;
    }

    public Royals(int name, int professionalBlurb, int pictureId, boolean isAcceptedByPeople){
        this.name = name;
        this.professionalBlurb = professionalBlurb;
        this.pictureId = pictureId;
        this.isAcceptedByPeople = isAcceptedByPeople;
    }
}

