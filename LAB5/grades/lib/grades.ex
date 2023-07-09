defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """

  defmodule Calculator do
    def percentage_grade(grades) do
      homework_total = sum_string_values(grades[:homework])
      labs_total = sum_string_values(grades[:labs])
      midterm = String.to_integer(grades[:midterm])
      final = String.to_integer(grades[:final])

      homework_length = length(grades[:homework])
      labs_length = length(grades[:labs])

      total = (homework_total / homework_length) * 0.15 + (labs_total / labs_length) * 0.3 + midterm * 0.25 + final * 0.3
      total
    end

    defp sum_string_values(values) do
      Enum.reduce(values, 0, fn value, acc -> acc + String.to_integer(value) end)
    end

    def letter_grade(grades) do
      note = percentage_grade(grades)

      case note do
        _ when note > 90 -> "A+"
        _ when note > 85 -> "A"
        _ when note > 80 -> "A-"
        _ when note > 75 -> "B+"
        _ when note > 70 -> "B"
        _ when note > 65 -> "B-"
        _ when note > 60 -> "C+"
        _ when note > 55 -> "C"
        _ when note > 50 -> "C-"
        _ when note > 45 -> "D+"
        _ when note > 40 -> "D"
        _ when note > 35 -> "D-"
        _ -> "F"
      end
    end

    def numeric_grade(grades) do
      note = percentage_grade(grades)

      case note do
        _ when note > 90 -> "10"
        _ when note > 85 -> "9"
        _ when note > 80 -> "8.5"
        _ when note > 75 -> "8"
        _ when note > 70 -> "7.5"
        _ when note > 65 -> "7"
        _ when note > 60 -> "6.5"
        _ when note > 55 -> "6"
        _ when note > 50 -> "5.5"
        _ when note > 45 -> "5"
        _ when note > 40 -> "4.5"
        _ when note > 35 -> "4"
        _ when note > 30 -> "3.5"
        _ when note > 25 -> "3"
        _ when note > 20 -> "2.5"
        _ when note > 15 -> "2"
        _ when note > 10 -> "1.5"
        _ when note > 5 -> "1"
        _ when note > 0 -> "0.5"
        _ -> "0"
      end
    end
  end
end
