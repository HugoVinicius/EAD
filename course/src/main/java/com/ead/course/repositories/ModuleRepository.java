package com.ead.course.repositories;

import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID> {

    @EntityGraph(attributePaths = {"course"})
    ModuleModel findByTitle(String title);

    @Query(value = "select * from tb_modules where course_course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findAllModulesIntoCourse(@Param("courseId") UUID courseId);

    @Query("select m from ModuleModel m where m.course.courseId = :courseId")
    List<Module> findByCourseIdJPQL(@Param("courseId") Long courseId);

    @Modifying
    @Query("delete from ModuleModel m where m.course.courseId = :courseId")
    void deleteByCourseIdJPQL(@Param("courseId") Long courseId);

}
