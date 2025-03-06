package com.agiles.UniChain.feature.classschedules.controller;

import com.agiles.UniChain.feature.classschedules.entity.Course;
import com.agiles.UniChain.feature.classschedules.payload.request.CourseRequestDto;
import com.agiles.UniChain.generic.controller.AbstractController;
import com.agiles.UniChain.generic.payload.request.GenericSearchDto;
import com.agiles.UniChain.generic.service.IService;

public class AssignmentController extends AbstractController<Course, CourseRequestDto, GenericSearchDto> {
    public AssignmentController(IService<Course, CourseRequestDto, GenericSearchDto> service) {
        super(service);
    }
}
