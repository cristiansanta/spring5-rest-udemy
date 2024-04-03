package com.globant.proyecto6inyeccionmultiplesobjetos.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArreaCalculatorService
{
    @Autowired
    private List<Figure> figures;
    public double calcAreas()
    {
        double area=0;
        for(Figure figure : figures)
        {
            area+=figure.calculateArea();
        }
        return area;
    }

}
