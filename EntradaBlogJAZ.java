
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
		/**
		*@param el primer parametro sera un tipo entero que se almacenara en la variable id
		*@param el segundo parametro sera un tipo string que se almacenara en la variable autor
		*@param el segundo parametro sera un tipo string que se almacenara en la variable texto
		*/
            if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
            this.id=id;
            this.autor=autor;
            this.texto=texto;
        }
        @Override
        public String toString(){ 
		/** 
		*@param espera un String
		*/
            String cad="";
            cad+="\nENTRADA DE"+separador+autor;
            cad+="\n "+texto;
            return cad; 
		/**
		*@return devuelve el valor que tenga almacenada la variable cad
		*/
        }

        /**
         * Devuelve el número de la entrada
         */
        public int getId(){
		/**
		*@param espera un int
		*/
            return this.id;
		/**
		*@return devuelve el valor que tenga almacenada la variable id
		*/
        }

        /**
         * devuelve el texto completo de la entrada
         */
        public String getTexto(){
		/**
		*@param espera un String
		*/
            return this.texto;
		/**
		*@return devuelve el valor que tenga almacenada la variable texto
		*/
        }

        /**
         * devuelve el nombre del autor de la entrada en mayúsculas
         */
        public String getAutor(){
			/**
		*@param espera un String
		*/
            return this.autor.toUpperCase();
			/**
		*@return devuelve el valor que tenga almacenada la variable autor
		*/
        }
         /**
         * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         */
        public String devuelveAutor(){
		/**
		*@param espera un String
		*/
            return this.autor;  
		/**
		*@return devuelve el valor que tenga almacenada la variable autor
		*/
        }

        /**
         * No tiene porqué tener argumentos
         */
        public static void main(String[] args) {
            /**
             * metodo main que crea un nuevo objeto de la clase entragablogjaz e imprime por pantalla el objeto
             */
            EntradaBlogJAZ e1=new EntradaBlogJAZ (-3,"jorge","Últimas noticias, está disponible BixBy 2.0");
            System.out.println(e1);
        }
    }
