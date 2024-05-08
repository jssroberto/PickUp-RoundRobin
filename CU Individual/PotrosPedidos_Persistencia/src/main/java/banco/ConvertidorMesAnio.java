package banco;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.YearMonth;

/**
 * ConvertidorMesAnio es un convertidor de atributos JPA que convierte objetos
 * YearMonth a java.sql.Date y viceversa. Almacena solo el último día del mes en
 * la base de datos.
 * 
 * @author Roberto García
 */
@Converter(autoApply = true)
public class ConvertidorMesAnio implements AttributeConverter<YearMonth, Date> {

    /**
     * Convierte un objeto YearMonth a un java.sql.Date, almacenando solo el
     * último día del mes.
     *
     * @param yearMonth el objeto YearMonth a convertir.
     * @return un java.sql.Date que representa el último día del mes.
     */
    @Override
    public Date convertToDatabaseColumn(YearMonth yearMonth) {
        return yearMonth == null ? null : Date.valueOf(yearMonth.atEndOfMonth());
    }

    /**
     * Convierte un java.sql.Date a un objeto YearMonth.
     * @param date el java.sql.Date a convertir.
     * @return un objeto YearMonth que representa el mes y el año del java.sql.Date.
     */
    @Override
    public YearMonth convertToEntityAttribute(Date date) {
        return date == null ? null : YearMonth.from(date.toLocalDate());
    }
}
