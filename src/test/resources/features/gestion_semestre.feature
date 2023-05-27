# Language: ESP

Feature: Agregar un nuevo semestre académico
  como vicedecano de docencia quiero registrar las fechas de un nuevo semestre académico
  para que los estudiantes puedan matricularsen y conocer el cronograma

Scenario: Registrar un nuevo semestre academico en la aplicacion
  Given que he ingresado a la pagina de la aplicacion
  When agrego una fecha inicial de semestre
  And agrego una fecha final de semestre
  And agrego fecha de evaluaciones finales
  And agrego fecha del cuarenta porciento evaluado
  And agrego fecha de validaciones
  And selecciono el botón agregar
  Then se graba el semestre académico
