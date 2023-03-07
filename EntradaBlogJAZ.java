
    /**
     * Clase para manejar las entradas de un blog.
     * La clase se creó el 05/03/2023 por jorge altet.
     * @version Esta es la versión 2.3
     * @author Jorge
     */
//Modificar.
    public class EntradaBlogJAZ{
        //separador es el ccarácter que separa ENTRADA DE del
        //nombre del autor

        public static char separador=':';
        private int id;
        private String texto;
        private String autor;

        /**
         * Constructor de la clase. recibe el número de entrada, el nombre del autor
         de la entrada y el texto que contiene la entrada. Si el número de entrada
        es negativo, lanza una excepción.
         */
	public EntradaBlogJAZ(int id,String autor,String texto)throws IllegalArgumentException{
            if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
            this.id=id;
            this.autor=autor;
            this.texto=texto;
        }
        @Override
        public String toString(){
            String cad="";
            cad+="\nENTRADA DE"+separador+autor;
            cad+="\n "+texto;
            return cad;
        }

        /**
         * Devuelve el número de la entrada
         */
        public int getId(){
            return this.id;
        }

        /**
         * devuelve el texto completo de la entrada
         */
        public String getTexto(){
            return this.texto;
        }

        /**
         * devuelve el nombre del autor de la entrada en mayúsculas
         */
        public String getAutor(){
            return this.autor.toUpperCase();
        }

        /**
         /**
         * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         */
        public String devuelveAutor(){
            return this.autor;
        }

        /**
         * No tiene porqué tener argumentos
         */
        public static void main(String[] args) {
            /**
             * Modificar
             */
            EntradaBlogJAZ e1=new EntradaBlogJAZ (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
            System.out.println(e1);
        }
    }
