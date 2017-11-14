package ru.af.formatvacancy;

import java.util.Collection;

/**
 * Позволяет получить список вкансий, хранящихся в БД или в txt файле
 */
public interface VacancyWriterInt {

    void insert(Collection<Vacancy> list);

    void deleteVacancy(String id);

    void updateVacancy(Vacancy vacancy);

}
