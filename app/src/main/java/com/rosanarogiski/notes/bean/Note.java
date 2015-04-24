package com.rosanarogiski.notes.bean;

import android.content.Context;
import android.graphics.Bitmap;

import com.mauriciogiordano.easydb.bean.Model;


public class Note extends Model<Note> {

    @ModelField
    private String id;

    @ModelField
    private String title;

    @ModelField
    private String imageSrc;

    @ModelField
    private float sum_rating;

    @ModelField
    private long timestamp;

    @ModelField
    private float number_rating;

    @ModelField
    private boolean upload;

    @ModelField
    private boolean download;

    @ModelField
    private boolean visualized;

    private Bitmap image;

    public Note() { super(Note.class, true); }

    public Note(Context context) {
        super(Note.class, true, context);
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public float getRating() {
        return sum_rating;
    }

    public void setRating(float rating) {
        this.sum_rating += rating;
        this.number_rating++;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public boolean isDownload() {
        return download;
    }

    public void setDownload(boolean download) {
        this.download = download;
    }

    public boolean isVisualized() {
        return visualized;
    }

    public void setVisualized(boolean visualized) {
        this.visualized = visualized;
    }

    public float getSum_rating() {
        return sum_rating;
    }

    public void setSum_rating(float sum_rating) {
        this.sum_rating = sum_rating;
    }

    public float getNumber_rating() {
        return number_rating;
    }

    public void setNumber_rating(float number_rating) {
        this.number_rating = number_rating;
    }
}
