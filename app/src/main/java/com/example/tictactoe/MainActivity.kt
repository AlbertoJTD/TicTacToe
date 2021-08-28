package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaracion de variables
        val radio1: RadioButton=findViewById(R.id.rb1)
        val radio2: RadioButton=findViewById(R.id.rb2)
        val radio3: RadioButton=findViewById(R.id.rb3)
        val radio4: RadioButton=findViewById(R.id.rb4)
        val radio5: RadioButton=findViewById(R.id.rb5)
        val radio6: RadioButton=findViewById(R.id.rb6)
        val radio7: RadioButton=findViewById(R.id.rb7)
        val radio8: RadioButton=findViewById(R.id.rb8)
        val radio9: RadioButton=findViewById(R.id.rb9)
        val radio10: RadioButton=findViewById(R.id.rb10)
        val radio11: RadioButton=findViewById(R.id.rb11)
        val radio12: RadioButton=findViewById(R.id.rb12)
        val radio13: RadioButton=findViewById(R.id.rb13)
        val radio14: RadioButton=findViewById(R.id.rb14)
        val radio15: RadioButton=findViewById(R.id.rb15)
        val radio16: RadioButton=findViewById(R.id.rb16)
        val radio17: RadioButton=findViewById(R.id.rb17)
        val radio18: RadioButton=findViewById(R.id.rb18)

        //Seleccionar X-O
        val val1: RadioButton=findViewById(R.id.radioButton1)
        val val2: RadioButton=findViewById(R.id.radioButton2)

        //Declaracion de radioGroup
        val grupoRadioButton: RadioGroup=findViewById(R.id.radioGroup)
        val grupoRadioButton1: RadioGroup=findViewById(R.id.radioGroup1)
        val grupoRadioButton2: RadioGroup=findViewById(R.id.radioGroup2)
        val grupoRadioButton3: RadioGroup=findViewById(R.id.radioGroup3)
        val grupoRadioButton4: RadioGroup=findViewById(R.id.radioGroup4)
        val grupoRadioButton5: RadioGroup=findViewById(R.id.radioGroup5)
        val grupoRadioButton6: RadioGroup=findViewById(R.id.radioGroup6)
        val grupoRadioButton7: RadioGroup=findViewById(R.id.radioGroup7)
        val grupoRadioButton8: RadioGroup=findViewById(R.id.radioGroup8)
        val grupoRadioButton9: RadioGroup=findViewById(R.id.radioGroup9)

        //Variables de mensajes
        val resul: TextView = findViewById(R.id.tv3)
        val tirar: TextView = findViewById(R.id.tv4)

        //Boton para jugar y reiniciar
        val jugar: Button = findViewById(R.id.btn2)
        val reiniciar: Button = findViewById(R.id.btn1)

        var jugador1=""
        var jugador2=""
        var casillas=9
        var contador=0

        var turno=1

        //valores de los radioButton
        var rb1=""
        var rb2=""
        var rb3=""
        var rb4=""
        var rb5=""
        var rb6=""
        var rb7=""
        var rb8=""
        var rb9=""

        //Deshabilitar botones y radioButton
        jugar.isEnabled=false
        reiniciar.isEnabled=false
        radio1.isEnabled=false
        radio2.isEnabled=false
        radio3.isEnabled=false
        radio4.isEnabled=false
        radio5.isEnabled=false
        radio6.isEnabled=false
        radio7.isEnabled=false
        radio8.isEnabled=false
        radio9.isEnabled=false
        radio10.isEnabled=false
        radio11.isEnabled=false
        radio12.isEnabled=false
        radio13.isEnabled=false
        radio14.isEnabled=false
        radio15.isEnabled=false
        radio16.isEnabled=false
        radio17.isEnabled=false
        radio18.isEnabled=false

        grupoRadioButton.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(r1.text == "X"){
                jugador1="X"
                jugador2="O"
                val1.isEnabled=false
                val2.isEnabled=false
            }else{
                jugador1="O"
                jugador2="X"
                val1.isEnabled=false
                val2.isEnabled=false
            }

            jugar.isEnabled=true

            tirar.text="Turno: Jugador 1"
        }

        grupoRadioButton1.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio2.isEnabled=false
                    radio1.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb1=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio2.isChecked=false
                    radio1.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio2.isEnabled=false
                    radio1.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb1=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio2.isChecked=false
                    radio1.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }

        }

        grupoRadioButton2.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio3.isEnabled=false
                    radio4.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb2=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio3.isChecked=false
                    radio4.isChecked=false
                }
            }else{

                if(r1.text == jugador2){
                    radio3.isEnabled=false
                    radio4.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb2=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio3.isChecked=false
                    radio4.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }
            }

        }

        grupoRadioButton3.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio5.isEnabled=false
                    radio6.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb3=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio5.isChecked=false
                    radio6.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio5.isEnabled=false
                    radio6.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb3=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio5.isChecked=false
                    radio6.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }
            }

        }

        grupoRadioButton4.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio7.isEnabled=false
                    radio8.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb4=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio7.isChecked=false
                    radio8.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio7.isEnabled=false
                    radio8.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb4=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio7.isChecked=false
                    radio8.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }

        }

        grupoRadioButton5.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio9.isEnabled=false
                    radio10.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb5=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio9.isChecked=false
                    radio10.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio9.isEnabled=false
                    radio10.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb5=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio9.isChecked=false
                    radio10.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }

        }

        grupoRadioButton6.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio11.isEnabled=false
                    radio12.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb6=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio11.isChecked=false
                    radio12.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio11.isEnabled=false
                    radio12.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb6=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio11.isChecked=false
                    radio12.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }

        }

        grupoRadioButton7.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio13.isEnabled=false
                    radio14.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb7=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio13.isChecked=false
                    radio14.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio13.isEnabled=false
                    radio14.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb7=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio13.isChecked=false
                    radio14.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }
        }

        grupoRadioButton8.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio15.isEnabled=false
                    radio16.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb8=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio15.isChecked=false
                    radio16.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio15.isEnabled=false
                    radio16.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb8=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio15.isChecked=false
                    radio16.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }

        }

        grupoRadioButton9.setOnCheckedChangeListener(){group,checkedId->
            val r1: RadioButton=findViewById(checkedId)

            if(turno == 1){
                if(r1.text == jugador1){
                    radio17.isEnabled=false
                    radio18.isEnabled=false
                    turno=2
                    tirar.text="Turno: Jugador 2"

                    rb9=jugador1

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio17.isChecked=false
                    radio18.isChecked=false
                }

            }else{
                if(r1.text == jugador2){
                    radio17.isEnabled=false
                    radio18.isEnabled=false
                    turno=1
                    tirar.text="Turno: Jugador 1"

                    rb9=jugador2

                    contador++
                }else{
                    Toast.makeText(this,"Error: No es el valor que escogiste", Toast.LENGTH_SHORT).show()
                    radio17.isChecked=false
                    radio18.isChecked=false
                }
            }

            if(contador == casillas){
                tirar.text="El juego ha finalizado"

                if((rb1 == jugador1 && rb2 == jugador1 && rb3 == jugador1)||
                    (rb4 == jugador1 && rb5 == jugador1 && rb6 == jugador1)||
                    (rb7 == jugador1 && rb8 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb4 == jugador1 && rb7 == jugador1)||
                    (rb2 == jugador1 && rb5 == jugador1 && rb8 == jugador1)||
                    (rb3 == jugador1 && rb6 == jugador1 && rb9 == jugador1)||

                    (rb1 == jugador1 && rb5 == jugador1 && rb9 == jugador1)||
                    (rb3 == jugador1 && rb5 == jugador1 && rb7 == jugador1)){

                    resul.text="Ganador: Jugador 1"

                }else if((rb1 == jugador2 && rb2 == jugador2 && rb3 == jugador2)||
                    (rb4 == jugador2 && rb5 == jugador2 && rb6 == jugador2)||
                    (rb7 == jugador2 && rb8 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb4 == jugador2 && rb7 == jugador2)||
                    (rb2 == jugador2 && rb5 == jugador2 && rb8 == jugador2)||
                    (rb3 == jugador2 && rb6 == jugador2 && rb9 == jugador2)||

                    (rb1 == jugador2 && rb5 == jugador2 && rb9 == jugador2)||
                    (rb3 == jugador2 && rb5 == jugador2 && rb7 == jugador2)){

                    resul.text="Ganador: Jugador 2"

                }else{
                    resul.text="Empate"

                }

            }

        }

        jugar.setOnClickListener{
            reiniciar.isEnabled=true
            radio1.isEnabled=true
            radio2.isEnabled=true
            radio3.isEnabled=true
            radio4.isEnabled=true
            radio5.isEnabled=true
            radio6.isEnabled=true
            radio7.isEnabled=true
            radio8.isEnabled=true
            radio9.isEnabled=true
            radio10.isEnabled=true
            radio11.isEnabled=true
            radio12.isEnabled=true
            radio13.isEnabled=true
            radio14.isEnabled=true
            radio15.isEnabled=true
            radio16.isEnabled=true
            radio17.isEnabled=true
            radio18.isEnabled=true

            Toast.makeText(this,"Activando casillas", Toast.LENGTH_SHORT).show()

        }

        reiniciar.setOnClickListener{
            radio1.isChecked=false
            radio2.isChecked=false
            radio3.isChecked=false
            radio4.isChecked=false
            radio5.isChecked=false
            radio6.isChecked=false
            radio7.isChecked=false
            radio8.isChecked=false
            radio9.isChecked=false
            radio10.isChecked=false
            radio11.isChecked=false
            radio12.isChecked=false
            radio13.isChecked=false
            radio14.isChecked=false
            radio15.isChecked=false
            radio16.isChecked=false
            radio17.isChecked=false
            radio18.isChecked=false

            radio1.isEnabled=false
            radio2.isEnabled=false
            radio3.isEnabled=false
            radio4.isEnabled=false
            radio5.isEnabled=false
            radio6.isEnabled=false
            radio7.isEnabled=false
            radio8.isEnabled=false
            radio9.isEnabled=false
            radio10.isEnabled=false
            radio11.isEnabled=false
            radio12.isEnabled=false
            radio13.isEnabled=false
            radio14.isEnabled=false
            radio15.isEnabled=false
            radio16.isEnabled=false
            radio17.isEnabled=false
            radio18.isEnabled=false

            reiniciar.isEnabled=false

            val1.isChecked=false
            val2.isChecked=false
            val1.isEnabled=true
            val2.isEnabled=true

            rb1=""
            rb2=""
            rb3=""
            rb4=""
            rb5=""
            rb6=""
            rb7=""
            rb8=""
            rb9=""
            tirar.text=""
            resul.text=""

            jugar.isEnabled=false

            Toast.makeText(this,"Reiniciando juego...", Toast.LENGTH_SHORT).show()
        }

    }
}