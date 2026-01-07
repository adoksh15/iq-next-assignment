import { useEffect, useState } from "react";
import { Button } from "@/components/ui/button";
import {
  Card,
  CardContent,
  CardHeader,
  CardTitle,
} from "@/components/ui/card";
import {
  Select,
  SelectContent,
  SelectItem,
  SelectTrigger,
  SelectValue,
} from "@/components/ui/select";

export default function App() {
  const [players, setPlayers] = useState([]);
  const [player1Id, setPlayer1Id] = useState("");
  const [player2Id, setPlayer2Id] = useState("");
  const [player1, setPlayer1] = useState(null);
  const [player2, setPlayer2] = useState(null);

  // ✅ Fetch ALL players for dropdown (REAL DB)
  useEffect(() => {
    fetch("http://localhost:8080/api/statistics/players")
      .then((res) => res.json())
      .then(setPlayers)
      .catch(console.error);
  }, []);

  // ✅ Fetch individual player details
  const fetchPlayer = async (id, setter) => {
    const res = await fetch(
      `http://localhost:8080/api/statistics/player/${id}`
    );
    const data = await res.json();
    setter(data);
  };

  // ✅ Compare button action
  const comparePlayers = () => {
    if (!player1Id || !player2Id) return;
    fetchPlayer(player1Id, setPlayer1);
    fetchPlayer(player2Id, setPlayer2);
  };

  return (
    <div className="min-h-screen bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950 text-white p-10">
      {/* Header */}
      <div className="mb-12">
        <h1 className="text-4xl font-bold flex items-center gap-3">
          ⚽ FIFA Player Comparison
        </h1>
        <p className="text-slate-400 mt-2">
          Compare football players using real FIFA World Cup statistics
        </p>
      </div>

      {/* Controls */}
      <div className="flex flex-wrap gap-4 mb-12 items-center">
        <Select onValueChange={setPlayer1Id}>
          <SelectTrigger className="w-64 bg-slate-900 border-slate-700">
            <SelectValue placeholder="Select Player 1" />
          </SelectTrigger>
          <SelectContent>
            {players.map((p) => (
              <SelectItem key={p.id} value={String(p.id)}>
                {p.player}
              </SelectItem>
            ))}
          </SelectContent>
        </Select>

        <Select onValueChange={setPlayer2Id}>
          <SelectTrigger className="w-64 bg-slate-900 border-slate-700">
            <SelectValue placeholder="Select Player 2" />
          </SelectTrigger>
          <SelectContent>
            {players.map((p) => (
              <SelectItem key={p.id} value={String(p.id)}>
                {p.player}
              </SelectItem>
            ))}
          </SelectContent>
        </Select>

        <Button className="px-8" onClick={comparePlayers}>
          Compare
        </Button>
      </div>

      {/* Comparison Cards */}
      {player1 && player2 && (
        <div className="grid grid-cols-1 md:grid-cols-2 gap-8">
          {[player1, player2].map((p) => (
            <Card
              key={p.id}
              className="bg-slate-900/80 border border-slate-800 backdrop-blur shadow-lg hover:shadow-xl transition"
            >
              <CardHeader>
                <CardTitle className="text-2xl text-white">
                  {p.player}
                </CardTitle>
                <p className="text-slate-400 text-sm">
                  {p.team} • {p.position}
                </p>
              </CardHeader>

              <CardContent className="space-y-4 text-lg text-slate-300">
                <p>
                  🏟 Games Played:{" "}
                  <span className="text-yellow-400 font-semibold">
                    {p.games}
                  </span>
                </p>

                <p>
                  ⏱ Minutes Played:{" "}
                  <span className="text-blue-400 font-semibold">
                    {p.minutes}
                  </span>
                </p>

                <p>
                  ⚽ Goals:{" "}
                  <span className="text-green-400 font-semibold">
                    {p.goals}
                  </span>
                </p>

                <p>
                  🎂 Birth Year:{" "}
                  <span className="text-white font-semibold">
                    {p.birthYear}
                  </span>
                </p>
              </CardContent>
            </Card>
          ))}
        </div>
      )}
    </div>
  );
}
