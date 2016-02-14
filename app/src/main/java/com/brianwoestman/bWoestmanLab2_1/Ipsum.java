package com.brianwoestman.bWoestmanLab2_1;

/**
 * Created by Brian Woestman on 2/6/16.
 * Android Programming
 * We 5:30p - 9:20p
 */

/**
 * This class is a bean that holds info about each article and heading
 */
public class Ipsum {

    private String title;
    private String content;

    /**
     * Instantiates a new Ipsum.
     */
    public Ipsum() {
    }


    /**
     * Instantiates a new Ipsum.
     *
     * @param title   the title
     * @param content the content
     */
    public Ipsum(String title, String content) {
        this();
        this.title = title;
        this.content = content;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }
}
