package timelineManager.model;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.scene.paint.Color;


public class Timeline {
	private long id;
	private String title = "";
	private String description = "";
	private LocalDate startTime;
	private LocalDate endTime;
	private Color color;
	private ArrayList<Task> task;
	private static long counter = 1;
	
	/**
	 * The constructor adds a unique ID to each created object of the class.
	 */
	public Timeline(){
		this.id = counter++;
	}
	
	public Timeline(String title, String description, LocalDate startTime, LocalDate endTime, Color color) {
		this.id = counter++;
		this.title = title;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.color = color;
	}
	
	/*timelineManager.model.Task*/
	public void addTask(Task t){
		task.add(t);
	}
	public void editTask(Task t){
		
	}
	public void deleteTask(Task t){
		task.remove(t);
	}
	/*
			Getters & Setters
	 */
	public long getId(){
		return id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public void setStartTime(LocalDate startTime){
		this.startTime = startTime;
	}
	public LocalDate getStartTime(){
		return startTime;
	}
	public void setEndTime(LocalDate endTime){
		this.endTime = endTime;
	}
	public LocalDate getEndTime(){
		return endTime;
	}
	public void setColor(Color color){
		this.color = color;
	}
	public Color getColor(){
		return color;
	}
	
}

