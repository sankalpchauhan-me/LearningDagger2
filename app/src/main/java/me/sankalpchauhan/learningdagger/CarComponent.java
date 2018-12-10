package me.sankalpchauhan.learningdagger;

import dagger.Component;

@Component
public interface CarComponent {
    //It's the most important peice of dagger it creates all the components
    //It knowes what to do from where to construct the car
    //Also known as "Injector"

    Car getCar();
}
