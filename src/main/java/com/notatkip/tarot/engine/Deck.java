package com.notatkip.tarot.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Deck {

    private List<Card> cards = fillDeck();

    private Random rnd = new Random();


//    private List<Card> createDeck() {
//        List<Card> localCards = new ArrayList<>();
//        for (int i = 1; i <= 78; i++) {
//            localCards.add(new Card(i, "", "", ""));
//        }
//        return localCards;
//    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }


    public void shuffleDeckSecondMethod() {
        randomPsosition(cards);
        shuffleArray(cards);

    }


    private void randomPsosition(List<Card> cards) {
        this.cards = cards.stream().map(c -> {
            c.setUprightPosition(rnd.nextBoolean());
            return c;
        }).collect(Collectors.toList());
    }


    private void shuffleArray(List<Card> ar) {

        for (int i = ar.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card card = ar.get(index);
            ar.set(index, ar.get(i));
            ar.set(i, card);
        }
    }


//    public String indexesOfCards() {
//        StringJoiner sj = new StringJoiner(",");
//        cards.forEach(c -> sj.add(String.valueOf(c.getIndex())));
//        return sj.toString();
//    }

    public int size() {
        return cards.size();
    }


    public Card getCard(int numberOfCard) {
        return cards.get(numberOfCard);
    }


    private List<Card> fillDeck() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("0", "major_00", "The Fool", "głupiec", "childlike wonder, new beginnings, risks", "dziecięcy zachwyt, nowy początek, ryzyko"));
        cards.add(new Card("1", "major_01", "The Magician", "mag", "alchemy, manifestation, willlpower", "siła woli, manifestacja, alchemia"));
        cards.add(new Card("2", "major_02", "The High Priestess", "najwyższa kapłanka", "balance, intuition, secret knowledge", "równowaga, intuicja, wiedza tajemna"));
        cards.add(new Card("3", "major_03", "The Empress", "cesarzowa", "abundance, creativity, fertility", "obfitość, kreatywność, płodność"));
        cards.add(new Card("4", "major_04", "The Emperor", "cesarz", "ambition, father figure, responsibility", "ambicja, postać ojca, odpowiedzialność"));
        cards.add(new Card("5", "major_05", "The Hierophant", "kapłan", "big business, tradition, spirituality", "duży interes, tradycja, duchowość"));
        cards.add(
                new Card("6", "major_06", "The Lovers", "kochankowie", "love in all forms, consummate union, values aligned", "miłość we wszystkich formach, konsumować związek, dopasowane wartości"));
        cards.add(new Card("7", "major_07", "The Chariot", "rydwan", "battle, race to riches, victory", "bitwa, wyścig dla zysku, zwycięstwo"));
        cards.add(new Card("8", "major_08", "Strenght", "siła", "ballanced power, mind over matter, strength of character", "zrównoważona moc, umysł nad materią, siła charakteru "));
        cards.add(new Card("9", "major_09", "The Hermit", "eremita", "ascension, illumination, introspection", "wniebowstąpienie, oświecać, introspekcja"));
        cards.add(new Card("10", "major_10", "Wheel of Fortune", "koło fortuny", "luck, life cycles, major karmik events", "szczęście, cykle życia, ważne wydarzenia karmiczne"));
        cards.add(new Card("11", "major_11", "Justice", "sprawiedliwość", "truth, natural law, righted wrongs", "prawda, prawa naturalne, naprawione krzywdy"));
        cards.add(new Card("12", "major_12", "The Hanged Man", "wisielec", "following a higher calling, intuition, self improvement", "podążać za powołaniem, intuicja, doskonalenie siebie"));
        cards.add(new Card("13", "major_13", "Death", "śmierć", "death, rebith, understanding what's important", "śmierć, odrodzenie, zrozumienie co jest ważne"));
        cards.add(new Card("14", "major_14", "Temperance", "równowaga", "channeling divine energy, perfect harmony, impossible is possible",
                "połączenie z boską energią, perfekcyjna harmonia, niemożliwe jest możliwe"));
        cards.add(new Card("15", "major_15", "The Devil", "diabeł", "black magic, misguided devotion, spiritual awakening", "czarna magia, błędne oddanie, duchowe przebudzenie"));
        cards.add(new Card("16", "major_16", "The Tower", "wieża", "Acts of divine love, shocking change, liberation and freedom",
                "działanie boskiej miłości, szokująca zmiana, oswobodzenie i wolność"));
        cards.add(new Card("17", "major_17", "The Star", "gwiazda", "healing, hope, renewal", "leczenie, nadzieja, odnowienie"));
        cards.add(new Card("18", "major_18", "The Moon", "księżyc", "illusions, psychic messages, weathering the storm", "iluzja, wiadomość psychiczna, przepowiedzieć burzę"));
        cards.add(new Card("19", "major_19", "The Sun", "Słońce", "accomplishment, enlightment, vitality", "osiągnięcie, oświecenie, witalność"));
        cards.add(new Card("20", "major_20", "Judgement", "Sąd ostateczny", "introspection, legal ruling, rebith", "introspekcja, regulacje prawne, odrodzeni"));
        cards.add(new Card("21", "major_21", "The World", "Świat", "Beautiful beginnings, sacred contracts, infinite possibilites", "piękny początek, święty kontrakt, "));
        cards.add(new Card("22", "ace_cups", "Ace of Cups", "as pucharów", "pure joy, true fulfillment, divine inspiration", "czysta przyjemność, prawdziwe spełnienie, boskie natchnienie"));
        cards.add(new Card("23", "2_cups", "Two of Cups", "II puchary", "perfect harmony, sacred union, imbalance", "idealna harmonia, święty związek, brak równowagi"));
        cards.add(new Card("24", "3_cups", "Three of Cups", "III puchary", "celebration, soul groups, time to focus", "świętowanie, dusza towarzystwa, czas skupienia"));
        cards.add(new Card("25", "4_cups", "Four of Cups", "IV puchary", "contemplation, emotional weariness, spriritual awakening", "kontemplacja, emocjonalne zmęczenie, duchowe przebudzenie"));
        cards.add(new Card("26", "5_cups", "Five of Cups", "V pucharów", "loss, bereavement, better times ahead", "utrata, żałoba, lepsze czasy"));
        cards.add(new Card("27", "6_cups", "Six of Cups", "VI pucharów", "reunion, reminiscing, living in the past", "ponowne spotkanie, wspominać, żyć przeszłością"));
        cards.add(new Card("28", "7_cups", "Seven of Cups", "VII pucharów", "dreams, deception, determination", "sny, oszustwo, determinacja"));
        cards.add(new Card("29", "8_cups", "Eight of Cups", "VIII pucharów", "abandonment, escapism, perfect clarity", "porzucenie, ucieczka, doskonała przejrzystość"));
        cards.add(new Card("30", "9_cups", "Nine of Cups", "IX pucharów", "wishes granted, satisfaction,greed", "spełnione życzenia, satysfakcja, chciwość"));
        cards.add(new Card("31", "10_cups", "Ten of Cups", "X pucharów", "surprising insight, artistry, creative energy block", "zaskakujące spostrzeżenia, kunszt, kreatywny blok energetyczny"));
        cards.add(new Card("32", "page_cups", "Page of Cups", "giermek pucharów", "surprising insight, artistry, creative energy block",
                "zaskakujące spostrzeżenia, kunszt, kreatywny blok energetyczny"));
        cards.add(new Card("33", "knight_cups", "Knight of Cups", "rycerz pucharów", "joy and peace, true romance, trickery", "radość i pokój, prawdziwy romans, naciąganie"));
        cards.add(new Card("34", "queen_cups", "Queen of Cups", "królowa pucharów", "psychic visionary, compassion and nurturing, co-dependency",
                "psychika wizjonerska, współczucie i pielęgnacja, współzależność"));
        cards.add(new Card("35", "king_cups", "King of Cups", "król pucharów", "calm clarity, control over emotions, manipulation", "spokój, kontrola nad emocjami, manipulacja"));
        cards.add(new Card("36", "ace_pentacles", "Ace of Pentacles", "As denarów", "prosperity, divine gifts, lost opportunities", "dobrobyt, boskie dary, utracone szanse"));
        cards.add(new Card("37", "2_pentacles", "Two of Pentacles", "II denarów", "balance, go with the flow, financial hardships", "równowaga, iść z prądem, trudności finansowe"));
        cards.add(new Card("38", "3_pentacles", "Three of Pentacles", "III denarów", "collaboration, follow your dreams, lack of knowledge", "współpraca, podążać za marzeniami, brak wiedzy"));
        cards.add(new Card("39", "4_pentacles", "Four of Pentacles", "IV denarów", "material success, fear of loss, greed", "sukces materialny, strach przed stratą, chciwość"));
        cards.add(new Card("40", "5_pentacles", "Five of Pentacles", "V denarów", "dark night of the soul", "mroczna noc dla duszy"));
        cards.add(new Card("41", "6_pentacles", "Six of Pentacles", "VI denarów", "just rewards, shared wealth, setting firm boundaries",
                "po prostu nagrody, dzielić się bogactwem, ustalenie granic firmy"));
        cards.add(new Card("42", "7_pentacles", "Seven of Pentacles", "VII denarów", "reading what is sown, perseverence, lack of vision", "obserwować wyniki pracy, wytrwałość, brak wizji"));
        cards.add(new Card("43", "8_pentacles", "Eight of Pentacles", "VIII denarów", "apprenticeship, quality craftsmanship, perfectionism",
                "praktyka, nauka rzemiosła, wysokiej jakości rzemiosło, perfekcjonizm"));
        cards.add(new Card("44", "9_pentacles", "Nine of Pentacles", "IX denarów", "heaven of earth, independence, bad investments", "raj na ziemi, niepodległość, zła inwestycja"));
        cards.add(new Card("45", "10_pentacles", "Ten of Pentacles", "X denarów", "family, true wealth, loss", "rodzina, prawdziwy dobrobyt, strata"));
        cards.add(new Card("46", "page_pentacles", "Page of Pentacles", "giermek denarów", "quest for wisdom, abundant harvest, schattered energies",
                "poszukiwanie wizji, obfite zbiory, rozproszenie energii"));
        cards.add(new Card("47", "knight_pentacles", "Knight of Pentacles", "rycerz denarów", "reputation, reliability, results", "reputacja, niezawodność, rezultaty"));
        cards.add(new Card("48", "queen_pentacles", "Queen of Pentacles", "królowa denarów", "earth mother, opulence, manipulation", "królowa ziemi, bogactwo, manipulacja"));
        cards.add(new Card("49", "king_pentacles", "King of Pentacles", "król denarów", "power, prosperity, money obsession", "siła, dobrobyt, obsesja na punkcie pieniędzy"));
        cards.add(new Card("50", "ace_swords", "Ace of Swords", "As mieczy", "raw power, remarkable victory, tremendous loss", "surowa moc, znakomite zwycięstwo, ogromna strata"));
        cards.add(new Card("51", "2_swords", "Two of Swords", "II mieczy", "indecision, stalemate, information overload", "niezdecydowanie, pat, przeciążenie informacjami"));
        cards.add(new Card("52", "3_swords", "Three of Swords", "III mieczy", "heartbreakers, heavy crosses to bear, painful release",
                "złamanie serca, ciężkie przejścia do zniesienia, bolesne uwolnienie"));
        cards.add(new Card("53", "4_swords", "Four of Swords", "IV mieczy", "release from suffering, recuperation, restlessness", "uwolnienie od cierpienia, regeneracja, niepokój"));
        cards.add(new Card("54", "5_swords", "Five of Swords", "V mieczy", "winning at all costs, cowardliness, pride before fall", "wygrywając za wszelką cenę, tchórzostwo, duma przed upadkiem"));
        cards.add(new Card("55", "6_swords", "Six of Swords", "VI mieczy", "better times ahead, new home and hearth, feeling trapped", "lepsze czasy nadchodzą, nowy dom i serce, uczucie uwięzienia"));
        cards.add(new Card("56", "7_swords", "Seven of Swords", "VII mieczy", "devil in the details, failed plans, wishes granted", "diabeł tkwi w szczegółach, nieudane plany, życzenia"));
        cards.add(new Card("57", "8_swords", "Eight of Swords", "VIII mieczy", "blind to the truth, self-imposed prison, new perspectives", "ślepy na prawdę, samowolne więzienie, nowe perspektywy"));
        cards.add(new Card("58", "9_swords", "Nine of Swords", "IX mieczy", "mental anguish, guilty conscience, time heals all wounds", "ból umysłowy, nieczyste sumienie, czas leczy wszystkie rany"));
        cards.add(new Card("59", "10_swords", "Ten of Swords", "X mieczy", "betrayal, complete ruination, triumph over evil", "zdrada, kompletna ruina, triumf nad złem"));
        cards.add(new Card("60", "page_swords", "Page of Swords", "giermek mieczy", "agile mind, boundless energy, unkempt promises", "zwinny umysł, bezgraniczna energia, zaniedbane obietnice"));
        cards.add(new Card("61", "knight_swords", "Knight of Swords", "rycerz mieczy", "courage in action, purity of intentions, disregard for consequences",
                "odwaga w działaniu, czystość intencji, lekceważenie konsekwencji"));
        cards.add(new Card("62", "queen_swords", "Queen of Swords", "królowa mieczy", "quick-witted woman, fierce individualism, malicious intent",
                "bystra kobieta, ostry indywidualizm, złośliwy zamiar"));
        cards.add(
                new Card("63", "king_swords", "King of Swords", "król mieczy", "power of life and death, wise counsel, barbaric actions", "moc życia i śmierci, mądra rada, barbarzyńskie działania"));
        cards.add(new Card("64", "ace_wands", "Ace of Wands", "As buław", "inspiration, bright future, false starts", "inspiracja, jasna przyszłość, fałszywe starania"));
        cards.add(new Card("65", "2_wands", "Two of Wands", "II buław", "future planning, balancing act, false fears", "przyszłe plany, zbalansowany czyn, fałszywe obawy"));
        cards.add(new Card("66", "3_wands", "Three of Wands", "III buław", "wealth, treachery, dreams come true", "bogactwo, zdrada, marzenia się spełniły"));
        cards.add(new Card("67", "4_wands", "Four of Wands", "IV buław", "peace, prosperity, romance", "pokój, dobrobyt, romans"));
        cards.add(new Card("68", "5_wands", "Five of Wands", "V buław", "conflict, competition, hiding from truth", "konflikt, konkurencja, ukrywanie się przed prawdą"));
        cards.add(new Card("69", "6_wands", "Six of Wands", "VI buław", "moment of glory, progress, fall from grace", "moment chwały, postęp, wypadnięcie z łaski"));
        cards.add(new Card("70", "7_wands", "Seven of Wands", "VII buław", "courage, victory, indecision", "odwaga , zwycięstwo, niezdecydowanie"));
        cards.add(new Card("71", "8_wands", "Eight of Wands", "VIII buław", "hope, haste, stagnation", "nadzieja, pośpiech, stagnacja"));
        cards.add(new Card("72", "9_wands", "Nine of Wands", "IX buław", "resolve, resilience, road blocks", "rozwiązywać, elastyczność, korki drogowe"));
        cards.add(new Card("73", "10_wands", "Ten of Wands", "X buław", "ambition, duality of success, irresponsibility", "ambicja, dwuznaczność sukcesu, nieodpowiedzialność"));
        cards.add(new Card("74", "page_wands", "Page of Wands", "giermek buław", "courage, enthusiasm, instability", "odwaga, pasja, niestabilność"));
        cards.add(new Card("75", "knight_wands", "Knight of Wands", "rycerz buław", "power, passion, frustration", "moc, pasja, frustracja"));
        cards.add(new Card("76", "queen_wands", "Queen of Wands", "królowa buław", "generosity, fiery pasion, domination", "hojność, ognista pasja, dominacja"));
        cards.add(new Card("77", "king_wands", "King of Wands", "król buław", "loyality, a noble spirit, ruthlessness", "lojalność, szlachetny duch, bezwzględność"));
        return cards;
    }
}
