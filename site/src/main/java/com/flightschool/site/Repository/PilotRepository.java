package com.flightschool.site.Repository;

import java.util.List;

import com.flightschool.site.Model.Pilot;

public interface PilotRepository{

	int save(Pilot pilot);

    int update(Pilot pilot);

    int deleteById(int id);

    List<Pilot> findAll();

    Pilot findById(int id);

}