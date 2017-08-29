package com.hfad.stackoverflow.webservice.Models;

import java.util.List;

/**
 * Created by amir ali on 8/22/2017.
 */

public class Item {
    private List<String> tags;
    private Owner owner;
    private String is_answered;
    private String view_count;
    private String accepted_answer_id;
    private String answer_count;
    private String score;
    private String last_activity_date;//you shold convert it to date by new Date (long)
    private String creation_date;//you shold convert it to date by new Date (long)
    private String last_edit_date;//you shold convert it to date by new Date (long)
    private String question_id;
    private String link;
    private String title;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String is_answered() {
        return is_answered;
    }

    public void setIs_answered(String is_answered) {
        this.is_answered = is_answered;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }

    public String getAccepted_answer_id() {
        return accepted_answer_id;
    }

    public void setAccepted_answer_id(String accepted_answer_id) {
        this.accepted_answer_id = accepted_answer_id;
    }

    public String getAnswer_count() {
        return answer_count;
    }

    public void setAnswer_count(String answer_count) {
        this.answer_count = answer_count;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLast_activity_date() {
        return last_activity_date;
    }

    public void setLast_activity_date(String last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getLast_edit_date() {
        return last_edit_date;
    }

    public void setLast_edit_date(String last_edit_date) {
        this.last_edit_date = last_edit_date;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
