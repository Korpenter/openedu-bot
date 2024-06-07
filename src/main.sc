require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: хахаха

    state: /hello
        intent!: /привет
        a: Привет

    state: Bye
        intent!: /пока
        a: Пока

    state: /NoMatch
        event!: noMatch
        a: Я вас не понял.

    state: Match
        event!: match
        a: {{$context.intent.answer}}

        
theme: /WeatherForecast
    
    state: /weather
        q!: * ~прогноз * ~погода *
        q!: * ~погода *
        q!: * ~прогноз *
        q!: *будет [осадк*/~дождь/~снег/~град]*
        a: Погода будет хорошей. Такой вот прогноз погоды.
    
theme: /Banking
    
    state: /currency
        q!: * ~прогноз * ~валюта *
        q!: * ~курс * ~валюта *
        q!:*~валюта *
        q!: * ~курс *
        a: Я в курсе всех дел банка, вот курсы.