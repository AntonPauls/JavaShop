package com.itproger.shop.controllers;

import com.itproger.shop.models.Item;
import com.itproger.shop.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    //Создаем вин на основе интерфейса
    // Записи из таблици item
    private ItemRepository itemRepository;


    @GetMapping("/")
    /* можно прописывать любой функционал
    * который должен быть выполнен  при
    * переходе пользователя на главную страницу
    * (подключиться к базе данных, получить записи,
    * передать записи во внутрь шаблона любые)*/
    public String index(Model model){
        // получение данных из базы данных и передать данные во внутырь шаблона
        // специальный класс который позволяет нам вписать во внутирь все полученные записи
        // findAll() вытаскивает все записи с базы данных
        Iterable<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/about-us")
    /* можно прописывать любой функционал
    * который должен быть выполнен  при
    * переходе пользователя на главную страницу
    * (подключиться к базе данных, получить записи,
    * передать записи во внутрь шаблона любые)*/
    public String about(@RequestParam(name = "userName", required = false, defaultValue = "World") String userName, Model model){
        model.addAttribute("name", userName);
        return "about";
    }
}
