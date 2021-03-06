package demo.invoices;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Invoice implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Position(value = 1)
   private demo.invoices.Client clientData;
   @org.kie.api.definition.type.Position(value = 2)
   private java.util.List<demo.invoices.InvoiceLine> lines;
   @org.kie.api.definition.type.Position(value = 3)
   private java.math.BigDecimal total;
   @org.kie.api.definition.type.Position(value = 0)
   private java.lang.Long id;
   @org.kie.api.definition.type.Position(value = 4)
   private java.util.Date date;

   public demo.invoices.Client getClientData()
   {
      return this.clientData;
   }

   public void setClientData(demo.invoices.Client clientData)
   {
      this.clientData = clientData;
   }

   public java.util.List<demo.invoices.InvoiceLine> getLines()
   {
      return this.lines;
   }

   public void setLines(java.util.List<demo.invoices.InvoiceLine> lines)
   {
      this.lines = lines;
   }

   public java.math.BigDecimal getTotal()
   {
      return this.total;
   }

   public void setTotal(java.math.BigDecimal total)
   {
      this.total = total;
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.Date getDate()
   {
      return this.date;
   }

   public void setDate(java.util.Date date)
   {
      this.date = date;
   }

   public Invoice()
   {
   }

   public Invoice(java.lang.Long id, demo.invoices.Client clientData,
         java.util.List<demo.invoices.InvoiceLine> lines,
         java.math.BigDecimal total, java.util.Date date)
   {
      this.id = id;
      this.clientData = clientData;
      this.lines = lines;
      this.total = total;
      this.date = date;
   }

}