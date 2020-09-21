/**
 * пакет main
 * */
package main;
/**
 * импорт класса Gui
 * */
import gui.Gui;
/**
 * главный класс
 * */
public class Main {
	/**
	 * public - доступен для всех из любого класса и пакета
	 * static — означает что поле или метод принадлежит классу, 
	 * и создаётся в момент загрузки класса. 
	 * void означает, что метод ничего не возвращает. 
	 * String[] args — это массив аргументов с которыми может запускаться программа. 
	 * По умолчанию массив пуст.
	 * sdsdsdsdsdsdsdsdsd
	 * */
	public static void main(String[] args) {
	Gui gui = new Gui();//вызов Gui 
	gui.start();//запуск gui
	}
	
}
