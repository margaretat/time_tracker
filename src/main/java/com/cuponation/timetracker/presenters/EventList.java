package com.cuponation.timetracker.presenters;

import com.cuponation.timetracker.dao.EventDAO;
import com.cuponation.timetracker.entities.Event;
import org.primefaces.event.RowEditEvent;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class EventList {

    @Inject
    private EventDAO eventDAO;

    private List<Event> list;

    public void onEdit(RowEditEvent event) {
        eventDAO.update((Event) event.getObject());
        FacesMessage msg = new FacesMessage("Successfully Edited Event!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    @PostConstruct
    public void getAll() {
//        List<Event> realList = eventDAO.findAll();
        //TODO - fix the parameter count!!!
        list = eventDAO.findAll().subList(0, 500);
//        list = eventDAO.findAll();
    }

    public List<Event> getList() {
        return list;
    }

    public void setList(List<Event> list) {
        this.list = list;
    }
}
