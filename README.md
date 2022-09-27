# RotateStickAnimation 
Rotational animation of stick using jetpack compose  
**Here is how it looks !!!!**


https://user-images.githubusercontent.com/68183759/192494850-715f210b-67ae-48b4-abbd-2ad50f46899d.mp4



# How to use it ? 

To use the library paste following code in app level **build.gradle** file in your android project.

```
dependencies {
    ...
     implementation 'com.github.yogirajthombre:RotateStickAnimation:1.01'
}
```

Requirement
-----

This Library works only for the projects that have jetpack compose enabled in project .

Sample Usage 
-----

```
RotatetheStick(
                width = 160.dp,                         // Width of stick 
                hieght = 30.dp,                        // Hieght of stick 
                start_angle = 0.0f,                  // Rotation from angle 
                end_angle = 360.0f               // Rotation to angle 
                durationMillis = 1500           // Duration of animation.
            )
            
 You can alter the parameters passed to the method RotatetheStick() as per your requirement 

```
