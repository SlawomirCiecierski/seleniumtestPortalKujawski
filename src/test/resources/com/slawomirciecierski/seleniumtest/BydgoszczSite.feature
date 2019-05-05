Feature: Testy strony PortalKujawski.pl

  Scenario Outline: Szukaj tekstu na stronie Portalu Kujawskiego
    Given Użytkownik otworzy stronę Portalu Kujawskiego 'http://www.portalkujawski.pl/'
    When Użytkownik wyszuka słowo w Portalu Kujawskim '<slowoPK>'
    Then Użytkownik spodziewa się znaleźć tyle samo lub więcej słów w Portalu Kujawskim niż '<liczbaPK>'

    Examples:
      | slowoPK          | liczbaPK |
      | wziąść           | 1        |
      | kupywać          | 1        |
      | hleb             | 1        |
      | swetr            | 1        |
      | przekonywujący   | 1        |
      | włanczam         | 1        |
      | poszłem          | 1        |
      | wszechczasów     | 1        |
      | oddziaływujący   | 1        |
      | narazie          | 1        |
      | wacha            | 1        |
      | oddziaływuje     | 1        |
      | tylni            | 1        |
      | poprostu         | 1        |
      | spowrotem        | 1        |
      | możnaby          | 1        |
      | conajmniej       | 1        |
      | szyji            | 1        |
      | wgłąb            | 1        |
      | nadzieji         | 1        |
      | mierzeji         | 1        |
      | rządać           | 1        |
      | koleji           | 1        |
      | ludzią           | 1        |
      | wąha             | 1        |
      | przygotowywujący | 1        |
      | pierszy          | 1        |
      | czeci            | 1        |
      | jusz             | 1        |
      | muj              | 1        |
      | niewiem          | 1        |
      | piersza          | 1        |
      | doktur           | 1        |
      | bul              | 1        |
      | madka            | 1        |
      | pincet           | 1        |
      | curka            | 1        |
      | curke            | 1        |
      | curkę            | 1        |
      | lubiałem         | 1        |
      | tylni            | 1        |
      | gupi             | 1        |